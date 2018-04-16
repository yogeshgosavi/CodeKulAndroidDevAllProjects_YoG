package com.codekul.customviewjava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomET extends android.support.v7.widget.AppCompatEditText {
    private  Paint paint;
    public CustomET(Context context) {
        super(context);
        initPaint();
    }

    public CustomET(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       /*
        to Draw Circle
        canvas.drawCircle(20,20,30,paint);
         */

       /*
       to draw Notebook like Lines
        */
       // to set Color
        paint.setColor(Color.GREEN);
       for(int i = 0 ; i <100 ; i += 20)
           canvas.drawLine(0,10+i,1000,10 + i , paint);
    paint.setColor(Color.RED);
    canvas.drawLine(100,10,100,2000,paint);
    }

    private  void  initPaint(){
        paint = new Paint();
        paint.setColor(Color.BLUE);

    }

}
