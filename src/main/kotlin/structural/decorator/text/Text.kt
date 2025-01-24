package structural.decorator.text

interface Text {
    fun render(): String
}

// Concrete Component
class SimpleText(
    private val content: String
) : Text {
    override fun render(): String {
        return content
    }
}

// Base Decorator
abstract class TextDecorator(
    private val decoratedText: Text
) : Text {
    // The base decorator simply delegates all work to the
    // wrapped component. Extra behaviors can be added in
    // concrete decorators.
    override fun render(): String {
        return decoratedText.render()
    }
}

// Concrete decorators may call the parent implementation of
// the operation instead of calling the wrapped object
// directly. This approach simplifies extension of decorator
// classes.

// Concrete Decorators
class BoldDecorator(
    decoratedText: Text
) : TextDecorator(decoratedText) {
    override fun render(): String {
        return "<b>${super.render()}</b>"
    }
}

class ItalicDecorator(
    decoratedText: Text
) : TextDecorator(decoratedText) {
    override fun render(): String {
        return "<i>${super.render()}</i>"
    }
}

class UnderlineDecorator(
    decoratedText: Text
) : TextDecorator(decoratedText) {
    override fun render(): String {
        return "<u>${super.render()}</u>"
    }
}

// Main function to demonstrate usage
fun main() {
    val simpleText: Text = SimpleText("Hello, World!")

    // Apply Bold decoration
    val boldText: Text = BoldDecorator(simpleText)
    println(boldText.render()) // Output: <b>Hello, World!</b>

    // Apply Bold and Italic decoration
    val boldItalicText: Text = ItalicDecorator(boldText)
    println(boldItalicText.render()) // Output: <i><b>Hello, World!</b></i>

    // Apply Bold, Italic, and Underline decoration
    val fullyDecoratedText: Text = UnderlineDecorator(boldItalicText)
    println(fullyDecoratedText.render()) // Output: <u><i><b>Hello, World!</b></i></u>
}
