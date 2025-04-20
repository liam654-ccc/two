package com.example.tictactoe2players;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Cell {
    private int x,y;

    private int cellwidth;
    private Bitmap bitmapx,bitmapo;

    private final int xval=0;
    private final int Oval=1;
    private final int Emptyval=2;
    private int val;
    private Paint p;


    public Cell(int x, int y, int cellwidth, Bitmap bitmapx, Bitmap bitmapo) {
        this.x = x;
        this.y = y;
        this.cellwidth = cellwidth;
        this.bitmapx = bitmapx;
        this.bitmapo = bitmapo;
        this.val=Emptyval;
        p=new Paint();
        p.setStrokeWidth(50);
        p.setStyle(Paint.Style.STROKE);
    }
    public void draw(Canvas canvas){
        canvas.drawRect(x,y,x+cellwidth,y+cellwidth,p);
        if (val==xval){
            canvas.drawBitmap(bitmapx,x+10,y+10,null);
        }
        if (val==Oval){
            canvas.drawBitmap(bitmapo,x+10,y+10,null);
        }

    }


}
