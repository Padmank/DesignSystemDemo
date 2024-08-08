import android.content.res.Resources.Theme
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.figma.code.connect.FigmaConnect
import com.figma.code.connect.FigmaProperty
import com.figma.code.connect.FigmaType
import kotlin.String

@FigmaConnect("https://www.figma.com/design/xJgJWGR46sWblerwaOHla8/FigmaConnect?node-id=4%3A406")
public class PrimaryButtonDoc {
    @FigmaProperty(FigmaType.Text, "Text Content")
    public val textContent: String = "Sign Up"

    @Composable
    public fun ComponentExample() {
        Text(
            text = textContent,
            modifier = Modifier.background(color= Color.Blue).padding(4.dp)
        )
    }
}
