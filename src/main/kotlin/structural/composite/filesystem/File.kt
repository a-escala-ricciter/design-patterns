package structural.composite.filesystem

// This represents individual files, a "Leaf".
class File(
    private val name: String,
    private val size: Int
) : FileSystemComponent {
    override fun display(indent: String) {
        println("$indent- File: $name (Size: $size KB)")
    }

    override fun getSize(): Int {
        return size
    }
}
