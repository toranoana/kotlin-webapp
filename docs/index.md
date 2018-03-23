1.はじめに（開発環境のセットアップ）
---

### 1-1. IntelliJ Idea のインストール

- [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/001.png?raw=true" width="800px" />

### 1-2. リポジトリを取得

```bash
$ git clone https://github.com/toranoana/kotlin-webapp.git
```

### 1-3. プロジェクトのインポート

IntelliJ を起動して `Import Project` -> `build.gradle` を選択。

2.プロジェクトのセットアップ（ IntelliJ Idea ）
---

### 2-1. Java のバージョンを確認

```bash
$ java -version
java version "9.0.4"
Java(TM) SE Runtime Environment (build 9.0.4+11)
Java HotSpot(TM) 64-Bit Server VM (build 9.0.4+11, mixed mode)
```

### 2-2. JDK のパスを確認

```bash
$ /usr/libexec/java_home -V
Matching Java Virtual Machines (1):
    9.0.4, x86_64:	"Java SE 9.0.4"	/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home

/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
```

### 2-3. gradle.properties の JDK のパスを変更する

`gradle.properties` の `org.gradle.java.home=` 以降のパスを [2-2. JDK のパスを確認](https://github.com/KarageAgeta/kotlin-webapp/blob/master/docs/index.md#2-2-jdk-%E3%81%AE%E3%83%91%E3%82%B9%E3%82%92%E7%A2%BA%E8%AA%8D) で取得したものに変更。

```gradle
# TODO : Change to your JDK PATH
org.gradle.java.home=/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
```

3. ビルド
---
### 3-1. Gradle ツールを表示

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/002.png?raw=true"/>

### 3-2. アプリケーションの実行

Gradle ツールウィンドウ内の
```
 kotlin-webapp  -> Tasks  -> application  -> bootRun
```
を実行

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/003.png?raw=true"/>

### 3-3. http://localhost:8080/ にアクセス

- [http://localhost:8080/](http://localhost:8080/)