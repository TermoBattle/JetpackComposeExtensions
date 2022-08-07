package ru.ad.balbekov.library.widgets.icon

import androidx.annotation.StringRes
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource

/**
 * Icon component that draws a [painter] using [tint], defaulting to [LocalContentColor]. For a
 * clickable icon, see [IconButton].
 *
 * @param painter [Painter] to draw inside this Icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. This should always be provided unless this icon is used for decorative purposes,
 * and does not represent a meaningful action that a user can take. This text should be
 * localized, such as by using [androidx.compose.ui.res.stringResource] or similar
 * @param modifier optional [Modifier] for this Icon
 * @param tint tint to be applied to [painter]. If [Color.Unspecified] is provided, then no
 *  tint is applied
 */
@Composable
fun Icon(
    painter: Painter,
    @StringRes contentDescription: Int?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
) = Icon(
	painter = painter,
	contentDescription = contentDescription?.let { stringResource(id = it) },
	modifier = modifier,
	tint = tint
)