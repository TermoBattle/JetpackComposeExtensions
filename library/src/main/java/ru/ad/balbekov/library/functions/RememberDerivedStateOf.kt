@file:Suppress("unused")

package ru.ad.balbekov.library.functions

import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.Snapshot


/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    noinline calculation: () -> T,
): State<T> = remember(key1) {
    derivedStateOf(calculation)
}

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    key2: Any?,
    noinline calculation: () -> T,
): State<T> = remember(key1, key2) {
    derivedStateOf(calculation)
}

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    key2: Any?,
    key3: Any?,
    noinline calculation: () -> T,
): State<T> = remember(key1, key2, key3) { derivedStateOf(calculation) }

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    vararg keys: Any?,
    noinline calculation: () -> T,
): State<T> = remember(keys) { derivedStateOf(calculation) }





/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param policy mutation policy to control when changes to the [calculation] result trigger update.
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    policy: SnapshotMutationPolicy<T>,
    noinline calculation: () -> T,
): State<T> = remember(key1) {
    derivedStateOf(policy, calculation)
}

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param policy mutation policy to control when changes to the [calculation] result trigger update.
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    key2: Any?,
    policy: SnapshotMutationPolicy<T>,
    noinline calculation: () -> T,
): State<T> = remember(key1, key2) {
    derivedStateOf(policy, calculation)
}

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param policy mutation policy to control when changes to the [calculation] result trigger update.
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    key1: Any?,
    key2: Any?,
    key3: Any?,
    policy: SnapshotMutationPolicy<T>,
    noinline calculation: () -> T,
): State<T> = remember(key1, key2, key3) { derivedStateOf(policy, calculation) }

/**
 * WARNING!!!
 * This is an overload for the original method.
 * If you have any questions, please see the documentation of the original method
 *
 * Remembers a [State] object whose [State.value] is the result of [calculation]. The result of
 * calculation will be cached in such a way that calling [State.value] repeatedly will not cause
 * [calculation] to be executed multiple times, but reading [State.value] will cause all [State]
 * objects that got read during the [calculation] to be read in the current [Snapshot], meaning
 * that this will correctly subscribe to the derived state objects if the value is being read in
 * an observed context such as a [Composable] function.
 * Derived states without mutation policy trigger updates on each dependency change. To avoid
 * invalidation on update, provide suitable [SnapshotMutationPolicy] through [derivedStateOf]
 * overload.
 *
 * @param policy mutation policy to control when changes to the [calculation] result trigger update.
 * @param calculation the calculation to create the value this state object represents.
 */
@Suppress("NOTHING_TO_INLINE")
@Composable
inline fun <T> rememberDerivedStateOf(
    vararg keys: Any?,
    policy: SnapshotMutationPolicy<T>,
    noinline calculation: () -> T,
): State<T> = remember(keys) { derivedStateOf(policy, calculation) }