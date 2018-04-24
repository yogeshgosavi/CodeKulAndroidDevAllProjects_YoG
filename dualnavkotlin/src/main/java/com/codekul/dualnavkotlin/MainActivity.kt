package com.codekul.dualnavkotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toolbar = findViewById<android.support.v7.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        //        drawer.setDrawerListener(toggle);
        toggle.syncState()

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        //display the right navigation drawer
        displayRightNavigation()
    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END)
        } else {
            super.onBackPressed()
        }
        if(supportFragmentManager.backStackEntryCount == 1) finish() else super.onBackPressed()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)

        if (id == R.id.action_settings) {
            drawer.openDrawer(GravityCompat.END)
        }

        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_camera) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_camera)))

            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_gallery)))


        } else if (id == R.id.nav_slideshow) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_slideshow)))

        } else if (id == R.id.nav_manage) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_manage)))

        } else if (id == R.id.nav_share) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_share)))


        } else if (id == R.id.nav_send) {
            loadFrag(SelectedFragment.create((R.drawable.ic_menu_send)))


        }

        Toast.makeText(this@MainActivity, "Handle from navigation left", Toast.LENGTH_SHORT).show()
        val drawer = this.findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    /**
     * this method used for displaying the right navigation drawer
     */
    private fun displayRightNavigation() {
        val navigationViewRight = findViewById<NavigationView>(R.id.nav_view_right)
        navigationViewRight.setNavigationItemSelectedListener { item ->
            // Handle navigation view item clicks here.
            val id = item.itemId

            if (id == R.id.nav_camera) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_camera)))

                // Handle the camera action
            } else if (id == R.id.nav_gallery) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_gallery)))


            } else if (id == R.id.nav_slideshow) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_slideshow)))

            } else if (id == R.id.nav_manage) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_manage)))

            } else if (id == R.id.nav_share) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_share)))


            } else if (id == R.id.nav_send) {
                loadFrag(SelectedFragment.create((R.drawable.ic_menu_send)))


            }

            Toast.makeText(this@MainActivity, "Handle from navigation right", Toast.LENGTH_SHORT).show()
            val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
            drawer.closeDrawer(GravityCompat.END)
            true
        }
    }
    fun loadFrag(frag: android.support.v4.app.Fragment) {
        val tag =" ${frag :: class.java.canonicalName}-${Math.random() * 25}"
        val isPopped = supportFragmentManager.popBackStackImmediate(tag,0)

        if(!isPopped) {

            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.FrameLayout, frag)
                    .addToBackStack(tag)
                    .commit()
        }
    }




}
