package com.github.ai.fmstudio.entity

data class ProcessGroup(
    val name: String,
    val types: Set<ProcessType>,
    val processes: List<ProcessInfo>,
    val usedMemory: Long
)