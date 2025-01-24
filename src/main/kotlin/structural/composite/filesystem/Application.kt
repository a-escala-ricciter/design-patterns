package structural.composite.filesystem

// The client interacts with FileSystemComponent without worrying whether it’s dealing with a file or folder.
fun main() {
    // Create files
    val fileTxt = File("File1.txt", 10)
    val file2Jpg = File("File2.jpg", 200)
    val fileDocx = File("File3.docx", 50)

    // Create folders
    val folderDocs = Folder("Documents")
    val folderPictures = Folder("Pictures")

    // Add files to folders
    folderDocs.add(fileTxt)
    folderDocs.add(fileDocx)

    folderPictures.add(file2Jpg)

    // Create a root folder
    val root = Folder("Root")
    root.add(folderDocs)
    root.add(folderPictures)

    // Display structure and calculate total size
    println("File System Structure:")
    root.display()
    println("\nTotal Size: ${root.getSize()} KB")
}
