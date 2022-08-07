package ru.ad.balbekov.library.functions

import androidx.compose.foundation.layout.Column
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun RememberMutableStateOfPreview() {
	var a by rememberMutableStateOf(value = "")
	var b by rememberMutableStateOf(key1 = Unit, value = "")
	var c by rememberMutableStateOf(key1 = Unit, key2 = Unit, value = "")
	var d by rememberMutableStateOf(key1 = Unit, key2 = Unit, key3 = Unit, value = "")
	var e by rememberMutableStateOf(keys = arrayOf(Unit, Unit, Unit, Unit), value = "")
	
	Column {
		TextField(value = a, onValueChange = { a = it })
		TextField(value = b, onValueChange = { b = it })
		TextField(value = c, onValueChange = { c = it })
		TextField(value = d, onValueChange = { d = it })
		TextField(value = e, onValueChange = { e = it })
	}
	
}

/**
 * WARNING!!!
 * This is an overload for the original method. If you have any questions, please see the documentation of the original method
 *
 * Remember a new [MutableState] initialized with the passed in [value]
 *
 * The MutableState class is a single value holder whose reads and writes are observed by
 * Compose.
 * Additionally, writes to it is transacted as part of the [Snapshot] system.
 *
 * @param value the initial value for the [MutableState]
 * @param policy a policy to control how changes are handled in mutable snapshots.
 *
 * @see State
 * @see MutableState
 * @see SnapshotMutationPolicy
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberMutableStateOf(
	value: T,
	policy: SnapshotMutationPolicy<T> = structuralEqualityPolicy(),
): MutableState<T> = remember { mutableStateOf(value, policy) }

/**
 * WARNING!!!
 * This is an overload for the original method. If you have any questions, please see the documentation of the original method
 *
 * Remember a new [MutableState] initialized with the passed in [value]
 *
 * The MutableState class is a single value holder whose reads and writes are observed by
 * Compose.
 * Additionally, writes to it is transacted as part of the [Snapshot] system.
 *
 * @param value the initial value for the [MutableState]
 * @param policy a policy to control how changes are handled in mutable snapshots.
 *
 * @see State
 * @see MutableState
 * @see SnapshotMutationPolicy
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberMutableStateOf(
	key1: Any?,
	value: T,
	policy: SnapshotMutationPolicy<T> = structuralEqualityPolicy(),
): MutableState<T> = remember(key1) { mutableStateOf(value, policy) }


/**
 * WARNING!!!
 * This is an overload for the original method. If you have any questions, please see the documentation of the original method
 *
 * Remember a new [MutableState] initialized with the passed in [value]
 *
 * The MutableState class is a single value holder whose reads and writes are observed by
 * Compose.
 * Additionally, writes to it is transacted as part of the [Snapshot] system.
 *
 * @param value the initial value for the [MutableState]
 * @param policy a policy to control how changes are handled in mutable snapshots.
 *
 * @see State
 * @see MutableState
 * @see SnapshotMutationPolicy
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberMutableStateOf(
	key1: Any?,
	key2: Any?,
	value: T,
	policy: SnapshotMutationPolicy<T> = structuralEqualityPolicy(),
): MutableState<T> = remember(key1, key2) { mutableStateOf(value, policy) }

/**
 * WARNING!!!
 * This is an overload for the original method. If you have any questions, please see the documentation of the original method
 *
 * Remember a new [MutableState] initialized with the passed in [value]
 *
 * The MutableState class is a single value holder whose reads and writes are observed by
 * Compose. Additionally, writes to it is transacted as part of the [Snapshot] system.
 *
 * @param value the initial value for the [MutableState]
 * @param policy a policy to control how changes are handled in mutable snapshots.
 *
 * @see State
 * @see MutableState
 * @see SnapshotMutationPolicy
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberMutableStateOf(
	key1: Any?,
	key2: Any?,
	key3: Any?,
	value: T,
	policy: SnapshotMutationPolicy<T> = structuralEqualityPolicy(),
): MutableState<T> = remember(key1, key2, key3) { mutableStateOf(value, policy) }

/**
 * WARNING!!!
 * This is an overload for the original method. If you have any questions, please see the documentation of the original method
 *
 * Remember a new [MutableState] initialized with the passed in [value]
 *
 * The MutableState class is a single value holder whose reads and writes are observed by
 * Compose. Additionally, writes to it is transacted as part of the [Snapshot] system.
 *
 * @param value the initial value for the [MutableState]
 * @param policy a policy to control how changes are handled in mutable snapshots.
 *
 * @see State
 * @see MutableState
 * @see SnapshotMutationPolicy
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberMutableStateOf(
	vararg keys: Any?,
	value: T,
	policy: SnapshotMutationPolicy<T> = structuralEqualityPolicy(),
): MutableState<T> = remember(keys) { mutableStateOf(value, policy) }