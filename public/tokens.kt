import android.content.res.Resources
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

object DesignTokens {
  fun pxToDp(px: Double): Float {
    return (px / Resources.getSystem().displayMetrics.density).toFloat()
  }
  fun pxToDp(px: Int): Float {
    return px / Resources.getSystem().displayMetrics.density
  }

  fun pxToSp(px: Double): TextUnit {
    return (px / Resources.getSystem().displayMetrics.scaledDensity).sp
  }
  fun pxToSp(px: Int): TextUnit {
    return (px / Resources.getSystem().displayMetrics.scaledDensity).sp
  }

  object Color_ {
    val color_stylesGrayGray_100 = Color(0.94510f, 0.95294f, 0.96471f, 1f)
    val color_stylesGrayGray_200 = Color(0.87843f, 0.89412f, 0.91765f, 1f)
    val color_stylesGrayGray_300 = Color(0.78431f, 0.80784f, 0.85098f, 1f)
    val color_stylesGrayGray_400 = Color(0.65882f, 0.70196f, 0.76863f, 1f)
    val color_stylesGrayGray_50 = Color(0.98824f, 0.98824f, 0.99216f, 1f)
    val color_stylesGrayGray_500 = Color(0.50980f, 0.57255f, 0.66667f, 1f)
    val color_stylesGrayGray_600 = Color(0.35686f, 0.41961f, 0.52549f, 1f)
    val color_stylesGrayGray_700 = Color(0.21961f, 0.25882f, 0.32157f, 1f)
    val color_stylesGrayGray_800 = Color(0.14118f, 0.16863f, 0.20784f, 1f)
    val color_stylesGrayGray_900 = Color(0.09804f, 0.11373f, 0.14118f, 1f)
    val color_stylesGrayGray_950 = Color(0.08235f, 0.09412f, 0.11765f, 1f)
    val color_stylesPrimaryPrimary_500 = Color(0.48627f, 0.60392f, 0.92941f, 1f)
    val color_stylesPrimaryPrimary_600 = Color(0.29804f, 0.45882f, 0.90588f, 1f)
    val color_stylesPrimaryPrimary_700 = Color(0.11373f, 0.30980f, 0.84314f, 1f)
    val color_stylesPrimaryPrimary_800 = Color(0.06275f, 0.17255f, 0.47451f, 1f)
    val color_stylesPrimaryPrimary_900 = Color(0.03529f, 0.09020f, 0.25098f, 1f)
    val color_stylesPrimaryPrimary_950 = Color(0.02353f, 0.06275f, 0.17647f, 1f)
    val color_stylesPrimaryPrimary_100 = Color(0.94118f, 0.95686f, 0.99216f, 1f)
    val color_stylesPrimaryPrimary_200 = Color(0.87059f, 0.90196f, 0.98431f, 1f)
    val color_stylesPrimaryPrimary_300 = Color(0.77255f, 0.82353f, 0.96863f, 1f)
    val color_stylesPrimaryPrimary_400 = Color(0.64314f, 0.72549f, 0.95294f, 1f)
    val color_stylesPrimaryPrimary_50 = Color(0.98431f, 0.98824f, 1.0f, 1f)
    val color_stylesRedRed_100 = Color(0.99608f, 0.93333f, 0.93333f, 1f)
    val color_stylesRedRed_200 = Color(0.98824f, 0.84706f, 0.84706f, 1f)
    val color_stylesRedRed_300 = Color(0.98039f, 0.72941f, 0.72941f, 1f)
    val color_stylesRedRed_400 = Color(0.96863f, 0.57647f, 0.57647f, 1f)
    val color_stylesRedRed_50 = Color(1.0f, 0.98431f, 0.98431f, 1f)
    val color_stylesRedRed_500 = Color(0.95686f, 0.38824f, 0.38824f, 1f)
    val color_stylesRedRed_600 = Color(0.94118f, 0.16863f, 0.16863f, 1f)
    val color_stylesRedRed_700 = Color(0.78431f, 0.05490f, 0.05490f, 1f)
    val color_stylesRedRed_800 = Color(0.45490f, 0.03137f, 0.03137f, 1f)
    val color_stylesRedRed_900 = Color(0.25490f, 0.01569f, 0.01569f, 1f)
    val color_stylesRedRed_950 = Color(0.18824f, 0.01176f, 0.01176f, 1f)
    val color_stylesYellowYellow_100 = Color(0.99608f, 0.99608f, 0.94118f, 1f)
    val color_stylesYellowYellow_200 = Color(0.99216f, 0.98824f, 0.86667f, 1f)
    val color_stylesYellowYellow_300 = Color(0.98824f, 0.98039f, 0.76078f, 1f)
    val color_stylesYellowYellow_400 = Color(0.98431f, 0.96863f, 0.62745f, 1f)
    val color_stylesYellowYellow_50 = Color(1.0f, 1.0f, 0.98431f, 1f)
    val color_stylesYellowYellow_500 = Color(0.97647f, 0.95686f, 0.46275f, 1f)
    val color_stylesYellowYellow_600 = Color(0.96471f, 0.94118f, 0.27059f, 1f)
    val color_stylesYellowYellow_700 = Color(0.95686f, 0.92549f, 0.04314f, 1f)
    val color_stylesYellowYellow_800 = Color(0.52941f, 0.51373f, 0.02353f, 1f)
    val color_stylesYellowYellow_900 = Color(0.27451f, 0.26667f, 0.01176f, 1f)
    val color_stylesYellowYellow_950 = Color(0.19216f, 0.18431f, 0.00784f, 1f)
  }

  object TextStyle_ {
    val text_stylesBodyBold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(17), lineHeight = pxToSp(22), textIndent = pxToSp(0),)
    val text_stylesBodyMedium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(17), lineHeight = pxToSp(22), textIndent = pxToSp(0),)
    val text_stylesBodyRegular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(17), lineHeight = pxToSp(22), textIndent = pxToSp(0),)
    val text_stylesBodySemibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(17), lineHeight = pxToSp(22), textIndent = pxToSp(0),)
    val text_stylesCalloutBold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(16), lineHeight = pxToSp(21), textIndent = pxToSp(0),)
    val text_stylesCalloutMedium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(16), lineHeight = pxToSp(21), textIndent = pxToSp(0),)
    val text_stylesCalloutRegular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(16), lineHeight = pxToSp(21), textIndent = pxToSp(0),)
    val text_stylesCalloutSemibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(16), lineHeight = pxToSp(21), textIndent = pxToSp(0),)
    val text_stylesCaption_1Bold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(12), lineHeight = pxToSp(16), textIndent = pxToSp(0),)
    val text_stylesCaption_1Medium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(12), lineHeight = pxToSp(16), textIndent = pxToSp(0),)
    val text_stylesCaption_1Regular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(12), lineHeight = pxToSp(16), textIndent = pxToSp(0),)
    val text_stylesCaption_1Semibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(12), lineHeight = pxToSp(16), textIndent = pxToSp(0),)
    val text_stylesCaption_2Bold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(11), lineHeight = pxToSp(13), textIndent = pxToSp(0),)
    val text_stylesCaption_2Medium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(11), lineHeight = pxToSp(13), textIndent = pxToSp(0),)
    val text_stylesCaption_2Regular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(11), lineHeight = pxToSp(13), textIndent = pxToSp(0),)
    val text_stylesCaption_2Semibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(11), lineHeight = pxToSp(13), textIndent = pxToSp(0),)
    val text_stylesFootnoteBold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(13), lineHeight = pxToSp(18), textIndent = pxToSp(0),)
    val text_stylesFootnoteMedium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(13), lineHeight = pxToSp(18), textIndent = pxToSp(0),)
    val text_stylesFootnoteRegular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(13), lineHeight = pxToSp(18), textIndent = pxToSp(0),)
    val text_stylesFootnoteSemibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(13), lineHeight = pxToSp(18), textIndent = pxToSp(0),)
    val text_stylesHeadlineSemibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(17), lineHeight = pxToSp(22), textIndent = pxToSp(0),)
    val text_stylesLarge_titleBold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(34), lineHeight = pxToSp(41), textIndent = pxToSp(0),)
    val text_stylesLarge_titleMedium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(34), lineHeight = pxToSp(41), textIndent = pxToSp(0),)
    val text_stylesLarge_titleRegular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(34), lineHeight = pxToSp(41), textIndent = pxToSp(0),)
    val text_stylesLarge_titleSemibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(34), lineHeight = pxToSp(41), textIndent = pxToSp(0),)
    val text_stylesTitle_1Bold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(28), lineHeight = pxToSp(34), textIndent = pxToSp(0),)
    val text_stylesTitle_1Medium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(28), lineHeight = pxToSp(34), textIndent = pxToSp(0),)
    val text_stylesTitle_1Regular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(28), lineHeight = pxToSp(34), textIndent = pxToSp(0),)
    val text_stylesTitle_1Semibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(28), lineHeight = pxToSp(34), textIndent = pxToSp(0),)
    val text_stylesTitle_2Bold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(22), lineHeight = pxToSp(28), textIndent = pxToSp(0),)
    val text_stylesTitle_2Medium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(22), lineHeight = pxToSp(28), textIndent = pxToSp(0),)
    val text_stylesTitle_2Regular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(22), lineHeight = pxToSp(28), textIndent = pxToSp(0),)
    val text_stylesTitle_2Semibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(22), lineHeight = pxToSp(34), textIndent = pxToSp(0),)
    val text_stylesTitle_3Bold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(20), lineHeight = pxToSp(25), textIndent = pxToSp(0),)
    val text_stylesTitle_3Medium = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Medium, style = FontStyle.Normal)), fontWeight = FontWeight.Medium, fontStyle = FontStyle.Normal, fontSize = pxToSp(20), lineHeight = pxToSp(25), textIndent = pxToSp(0),)
    val text_stylesTitle_3Regular = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Normal, style = FontStyle.Normal)), fontWeight = FontWeight.Normal, fontStyle = FontStyle.Normal, fontSize = pxToSp(20), lineHeight = pxToSp(25), textIndent = pxToSp(0),)
    val text_stylesTitle_3Semibold = TextStyle(fontFamily = FontFamily(Font(resId = R.font.SF Pro Display, weight = FontWeight.Bold, style = FontStyle.Normal)), fontWeight = FontWeight.Bold, fontStyle = FontStyle.Normal, fontSize = pxToSp(20), lineHeight = pxToSp(25), textIndent = pxToSp(0),)
  }

}