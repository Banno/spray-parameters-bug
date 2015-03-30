# spray-parameters-bug

We noticed a bug when upgrading to spray 1.3.3. The output from sbt is pasted below. Refer to the [spray issue](https://github.com/spray/spray/issues/1036) for conversation.

```
[error] /Users/adam/src/banno/spray-parameters-bug/src/main/scala/Boot.scala:18: too many arguments for method parameters: (pdm: spray.routing.directives.ParamDefMagnet)pdm.Out
[error]     parameters('thing.as[Boolean], 'thing2.as[Boolean])
[error]               ^
[error] one error found
[error] (compile:compile) Compilation failed
[error] Total time: 0 s, completed Mar 30, 2015 11:24:38 AM
```
