package com.codekul.yog.inttoword;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = findViewById(R.id.ptnum);
                int temp = Integer.parseInt(editText.getText().toString());
                TextView textView =findViewById(R.id.showWord);

                String numtoword = numToWords(temp);
                textView.setText(""+numtoword);
            }
        });
    }


    /**
     * Created by YOG on 3/23/2018.
     */

        public static class NumberToWordConverter {

            public static final String[] units = {"", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                    "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                    "Eighteen", "Nineteen"};

            public static final String[] tens = {
                    "",        // 0
                    "",        // 1
                    "Twenty",    // 2
                    "Thirty",    // 3
                    "Forty",    // 4
                    "Fifty",    // 5
                    "Sixty",    // 6
                    "Seventy",    // 7
                    "Eighty",    // 8
                    "Ninety"    // 9
            };

            public static String convert(final int n) {
                if (n < 0) {
                    return "Minus " + convert(-n);
                }

                if (n < 20) {
                    return units[n];
                }

                if (n < 100) {
                    return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
                }

                if (n < 1000) {
                    return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
                }

                if (n < 100000) {
                    return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
                }

                if (n < 10000000) {
                    return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
                }

                return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
            }
        }
    private String numToWords (int n){ //optional
        NumberToWordConverter ntw = new NumberToWordConverter(); // directly implement this
        return ntw.convert(n);
    }
}
