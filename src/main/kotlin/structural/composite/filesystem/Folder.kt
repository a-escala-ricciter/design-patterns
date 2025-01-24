package structural.composite.filesystem

// Composite Class: This represents folders that can contain files or other folders.
class Folder(private val name: String) : FileSystemComponent {
    private val children = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        children.add(component)
    }

    fun remove(component: FileSystemComponent) {
        children.remove(component)
    }

    override fun display(indent: String) {
        println("$indent+ Folder: $name")
        children.forEach { it.display("$indent  ") }
    }

    override fun getSize(): Int {
        return children.sumOf { it.getSize() }
    }
}
