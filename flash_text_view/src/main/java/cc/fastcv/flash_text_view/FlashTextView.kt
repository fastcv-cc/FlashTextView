package cc.fastcv.flash_text_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.LinearGradient
import android.graphics.Matrix
import android.graphics.Shader
import android.util.AttributeSet

class FlashTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.textViewStyle
) : androidx.appcompat.widget.AppCompatTextView(context, attrs, defStyleAttr) {

    //矩阵对象
    private var gradientMatrix: Matrix? = null

    //渐变效果
    private var flashGradient: LinearGradient? = null

    //平移距离
    private var xTranslate = 0

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        if (w > 0 && gradientMatrix == null) {
            //保证只初始化一次
            flashGradient = LinearGradient(
                0f,
                0f,
                w * 1.0f,
                0f,
                intArrayOf(textColors.defaultColor, 0xffffff, textColors.defaultColor),
                null,
                Shader.TileMode.CLAMP
            )
            paint.setShader(flashGradient)
            gradientMatrix = Matrix()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //绘制文字之后
        if (gradientMatrix != null) {
            xTranslate += measuredWidth / 5
            if (xTranslate > 2 * measuredWidth) {//决定文字闪烁的频繁:快慢
                xTranslate = -measuredWidth
            }
            gradientMatrix!!.setTranslate(xTranslate * 1.0f, 0f)
            flashGradient!!.setLocalMatrix(gradientMatrix)
            postInvalidateDelayed(100)
        }

    }
}