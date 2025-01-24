package structural.composite.filesystem

// This is the common interface for both "leaf" and "composite" objects.
interface FileSystemComponent {
    fun display(indent: String = "")
    fun getSize(): Int
}
