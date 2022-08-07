package ru.ad.balbekov.library.widgets.icon

import androidx.annotation.StringRes
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.stringResource

/**
 * Icon component that draws [bitmap] using [tint], defaulting to [LocalContentColor].
 * For a clickable icon, see [IconButton].
 *
 * @param bitmap [ImageBitmap] to draw inside this Icon
 * @param contentDescription [StringRes] used by accessibility services to describe what this icon
 * represents.
 * This should always be provided
 * unless this icon is used for decorative purposes,
 * and does not represent a meaningful action
 * that a user can take.
 * @param modifier optional [Modifier] for this Icon
 * @param tint tint to be applied to [bitmap].
 * If [Color.Unspecified] is provided, then no
 * tint is applied
 */
@Suppress("unused")
@Composable
@NonRestartableComposable
fun Icon(
    bitmap: ImageBitmap,
    @StringRes contentDescription: Int?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) = Icon(
    bitmap = bitmap,
    contentDescription = contentDescription?.let { stringResource(id = it) },
    modifier = modifier,
    tint = tint
)