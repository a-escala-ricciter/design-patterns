package creational.singleton.kotlin

class KotlinSingleton {
    // @Volatile ensures that any thread accessing instance sees the most recent value of it.
    // Without @Volatile, it's possible that one thread may see a partially constructed or cached version of instance, which could lead to bugs or unexpected behavior.
    @Volatile
    private var instance: KotlinSingleton? = null
    val property = "Immutable property"

    fun getInstance(): KotlinSingleton {
        return instance ?: synchronized(this) {
            // Once inside the synchronized block, there is another check to see if instance is still null. This is known as the double-checked locking pattern.
            // Double-checked locking is necessary because, in a multithreaded environment, one thread could have initialized instance between the first check
            // (outside synchronized) and the synchronized block. So, the second check ensures that instance is still null before creating a new instance.
            instance ?: KotlinSingleton().also { instance = it }
        }
    }
}

// Good to notice that in kotlin, objects are singletons, so there's no need to control it like java
// This is only an illustrative example. Besides that, objects are already thread safe
object KotlinSingleton2 {
    val property = "Immutable property"
}

class Main {
    fun exampleSingletonWithClasses(): String = KotlinSingleton().getInstance().property
    fun exampleSingletonWithObjects(): String = KotlinSingleton2.property
}
