1.はじめに（開発環境のセットアップ）
---

### 1-1. IntelliJ Idea のインストール

- [https://www.jetbrains.com/idea/](https://www.jetbrains.com/idea/)

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/001.png?raw=true" width="800px" />

### 1-2. リポジトリを取得

```bash
$ git clone https://github.com/toranoana/kotlin-webapp.git
```

2.プロジェクトのセットアップ（ IntelliJ Idea ）
---

### 2-1. JDK のパスを確認

```bash
$ /usr/libexec/java_home -V
Matching Java Virtual Machines (1):
    9.0.4, x86_64:	"Java SE 9.0.4"	/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home

/Library/Java/JavaVirtualMachines/jdk-9.0.4.jdk/Contents/Home
```

### 2-2. プロジェクトのインポート

IntelliJ を起動して `Import Project` -> `./kotlin-webapp/build.gradle` を選択。

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/004.png?raw=true"/>

### 2-3. JDK のパスを設定

`Gradle JVM` のパスを [2-2. JDK のパスを確認](https://github.com/KarageAgeta/kotlin-webapp/blob/master/docs/index.md#2-2-jdk-%E3%81%AE%E3%83%91%E3%82%B9%E3%82%92%E7%A2%BA%E8%AA%8D) と同じものに変更

<img src="https://github.com/toranoana/kotlin-webapp/blob/master/docs/arts/005.png?raw=true"/>


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
