
import jdk.javadoc.internal.tool.Start
import kotlinx.coroutines.*

 fun main() = runBlocking() {

//    val thread = Thread {
//        for (i in 1..5) {
//            println("Thread: $i")
//            Thread.sleep(5000)
//        }
//    }
    println("Thread Starts ${Thread.currentThread().name}")
    val job: Job =  launch(start = CoroutineStart.LAZY){
        for (i in 1..10) {
            println("${Thread.currentThread().name} $i")
            yield()
        }
    }
     delay(10)
     job.cancel()
     job.join()
//    thread.start()
//    thread.join()
//    val num = job.await()
//      println(job.await())
     println("${Constants.thread} ${Thread.currentThread().name}")
}