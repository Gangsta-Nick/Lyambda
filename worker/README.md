## Лямбда выражения

### Функциональный интерфейс
### Работяга

В данной задаче реализован класс `Worker` который выполняет некоторые задачи и возвращать результат в родительский класс `Main`.

```java
public class Worker {

}
```

Для того, чтобы класс Worker мог вернуть резлультат своей работы, реализрван собственный функциональный интерфейс `OnTaskDoneListener`. В нем опредён только один метод `onDone()` без реализации и помечен интерфейс аннотацией `@FunctionalInterface`:
```java
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
```

В класс `Worker` добавлена переменная `callback` типа `OnTaskDoneListener`:
```java
private OnTaskDoneListener callback;
```

И передано её значение через конструктор:
```java
public Worker(OnTaskDoneListener callback) {
    this.callback = callback;
}
```
Смоделируйте выполнение классом Worker какой либо работы, например:
```java
public void start() {
    for (int i = 0; i < 100; i++) {
        callback.onDone("Task " + i + " is done");
    }
}
```
Каждая итерация цикла означает выполнение задачи, результат который передается через метод `onDone()` функционального интерфейса `OnTaskDoneListener`.
