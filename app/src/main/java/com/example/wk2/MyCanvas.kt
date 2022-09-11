package com.example.wk2

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.RadioButton
import com.google.android.material.shape.TriangleEdgeTreatment


class MyView : View {
    var px : Float = 0.0F
    var py : Float = 0.0F
    var rand : Int = 0

    var color = Color.BLUE
    private var paint = Paint()

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        paint.color = color
        paint.style = Paint.Style.FILL


        if (rand == 0){
            canvas.drawRect(px,py,px+100,py+100, paint)
        }
        else if (rand == 1){
            canvas.drawCircle(px, py, 100F, paint)
        }
        else{
            //삼각형
            canvas.drawLine(px-50,py,px+50,py,paint)
            canvas.drawLine(px+50,py,px,py-50,paint)
            canvas.drawLine(px,py-50,px-50,py,paint)

        }
        //매번 다른 도형을 그리도록 함.
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN) {
            px = event.x.toFloat()
            py = event.y.toFloat()
            invalidate()
            return true
        }
        return super.onTouchEvent(event)
    }

}