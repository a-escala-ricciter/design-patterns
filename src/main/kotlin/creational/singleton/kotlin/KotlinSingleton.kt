package creational.singleton.kotlin

class KotlinSingleton private constructor() {
    companion object {
        // @Volatile ensures that any thread accessing instance sees the most recent value of it.
        // Without @Volatile, it's possible that one thread may see a partially constructed or cached version of instance, which could lead to bugs or unexpected behavior.
        @Volatile
        private var instance: KotlinSingleton? = null

        fun getInstance(): KotlinSingleton {
            return instance ?: synchronized(this) {
                // Once inside the synchronized block, there is another check to see if instance is still null. This is known as the double-checked locking pattern.
                // Double-checked locking is necessary because, in a multi-threaded environment, one thread could have initialized instance between the first check
                // (outside synchronized) and the synchronized block. So, the second check ensures that instance is still null before creating a new instance.
                instance ?: KotlinSingleton().also { instance = it }
            }
        }
    }
}
