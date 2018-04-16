package com.codekul.bouncybalrxajava;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class BallView extends android.support.v7.widget.AppCompatTextView {

    private Paint paint;
    private class  Ball {
        int x=5,y=5;
        int radius=30 ;
        int dx=5,dy=5;
    }
 private Ball ball;
    public BallView(Context context) {
        super(context);
        ball = new Ball();
        paint = new Paint();
        paint.setColor(Color.RED);
        ballmover()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext( integers -> invalidate())
                .doOnError( e -> Log.i("@codekul", e.toString()))
                .doOnComplete( () -> Log.i("@codekul", "Completed"))
                .subscribe();
    }



    // to get canvas  and we need paint veriable method to draw
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle( ball.x,ball.y,ball.radius,paint);
    }
public Flowable<Integer> ballmover(){
        return Flowable.create(emitter -> {
while (true){
    if(ball.x <0 ) ball.dx = 5;
    if(ball.x >= getWidth()) ball.dx = -5;
    if(ball.y <0 ) ball.dy = 5;
    if(ball.y >= getWidth()) ball.dy = -5;

    ball.x += ball.dx;
    ball.y += ball.dy;
    Thread.sleep(10);
    // sub.onNext(new Integer[]{ball.x, ball.y});
}
        },BackpressureStrategy.BUFFER);
    }
}
