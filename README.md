# How To Build

## ビルドに必要な物

* Ant

* [One-Jar](http://one-jar.sourceforge.net/)

* [JarJar](https://code.google.com/p/jarjar/)


## ビルド実行

以下の3つの形式の Jar を作成する。

1. ビルドした「.class」ファイルのみを含んだ Jar ファイル

  $ ant jar

2. ビルドした「.class」ファイルと、lib 配下の jar ファイルを含んだ jar ファイル
   (one-jar 形式？)

  $ ant onejar


3. ビルドした「.class」ファイルと、lib 配下の jar ファイルに含まれる「.class」ファイル
   を取り出して、1 つにまとめた jar ファイル
   (fatjar 形式？)

  $ ant fatjar

