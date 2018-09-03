package com.bwie.yangyuexiang;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by YangYueXiang
 * on 2018/9/3
 */
public class MyView extends View {

    private float mwidth;
    private float mheight;
    private int swidth;
    private int sheight;
    private Paint panpaint;
    private Paint paint;

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mwidth = MeasureSpec.getMode(widthMeasureSpec);
        mheight = MeasureSpec.getMode(heightMeasureSpec);

        swidth = MeasureSpec.getSize(widthMeasureSpec);
        sheight = MeasureSpec.getSize(heightMeasureSpec);
        if (mwidth==MeasureSpec.AT_MOST &mheight==MeasureSpec.AT_MOST){
            setMeasuredDimension(swidth,sheight);
        }else if (swidth==MeasureSpec.AT_MOST){
            setMeasuredDimension(swidth,450);
        }else if (mheight==MeasureSpec.AT_MOST){
            setMeasuredDimension(450,sheight);
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //创建画笔
        panpaint = new Paint();
        //图的
        paint = new Paint();
        panpaint.setColor(Color.BLUE);
       paint.setColor(Color.BLUE);

        paint.setTextSize(20);
      //  canvas.drawText("哈哈哈哈",100,440,paint);
        //计算高度
        int u=400/50;
        for (int i = 0; i <7 ; i++) {
            canvas.drawLine(100,100*i,swidth,100*i,panpaint);
        }
        for (int i = 0; i <5 ; i++) {
            canvas.drawLine(100+(100*i),0,100+(100*i),600,panpaint);
        }

        canvas.drawRect(100,200,100,600,paint);
        canvas.drawRect(130,600*0.2817f, 200,600,paint);
        canvas.drawRect(230,600*0.2148f,300,600,paint);
        canvas.drawRect(330,600*0.2270f,400,600,paint);
        canvas.drawRect(430,600*0.2270f,500,600,paint);
        //canvas.drawRect(440,360,500,600,paint);
        //canvas.drawRect(40,360,100,400,paint);
       // canvas.drawRect(40,360,100,400,paint);

        Paint paint=new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(2);
        paint.setTextSize(20);

        //canvas.drawText("500",40,100,paint);
        canvas.drawText("27.64%",120,600*0.2764f,paint);
        canvas.drawText("28.17%",220,600*0.2817f,paint);
        canvas.drawText("21.48%",320,600*0.2148f,paint);
        canvas.drawText("22.70%",420,600*0.2270f,paint);
        //canvas.drawText("500",40,300,paint);
       // canvas.drawText("500",40,300,paint);

        canvas.drawText("管理成本",100,620,paint);
        canvas.drawText("劳资成本",200,620,paint);
        canvas.drawText("销售成本",300,620,paint);
        canvas.drawText("资产盘亏",400,620,paint);

        canvas.drawText("0.00%",20,600,paint);
        canvas.drawText("5.00%",20,500,paint);
        canvas.drawText("10.00%",20,400,paint);
        canvas.drawText("15.00%",20,300,paint);
        canvas.drawText("20.00%",20,200,paint);
        canvas.drawText("25.00%",20,100,paint);
        canvas.drawText("30.00%",20,0,paint);

    }
}
