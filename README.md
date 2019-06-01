
[TOC]

[![](https://img.shields.io/github/forks/yunshuipiao/potato.svg)](https://github.com/yunshuipiao/potato)
[![](https://img.shields.io/github/stars/yunshuipiao/potato.svg)](https://github.com/yunshuipiao/potato)
[![](https://img.shields.io/github/license/yunshuipiao/potato.svg)](https://github.com/yunshuipiao/potato)
[![](https://img.shields.io/github/followers/yunshuipiao.svg)](https://github.com/yunshuipiao)

**Read the source code plan for the interview**

本项目来源于面试准备过程的资料收集，源码阅读，参考大量的网上内容。

持续更新中…

# 关于 issues label 的说明
  1. **CONCEPT**：纯概念介绍，需要记住
  2. **USAGE**：偏重用法，与 Source Code 相对应
  3. **Source Code**： 文章偏重源码分析，可能存在部分源码
  4. **AMA**： ask me anything， 尽最大努力回答
  5. **TODO， DOING**：文章进度相关



# Content

## Kotlin

[Kotlin](https://github.com/yunshuipiao/Potato/issues/31)： 基本使用和其原理

[Kotlin Coroutine](https://github.com/yunshuipiao/Potato/issues/56)： Kotlin 协程简介

## Java

[GC And Algorithm](https://github.com/yunshuipiao/Potato/issues/32)： 垃圾回收和相关算法

[JMM, JVM, Java Class Model](https://github.com/yunshuipiao/Potato/issues/27)：JVM 内存结构，Java 内存模型（JMM）， Java 对象模型

[HashMap：Core source code analysis](https://github.com/yunshuipiao/Potato/issues/17) ： HashMap 源码分析

[Java Thread](https://github.com/yunshuipiao/Potato/issues/44)： Java 线程和并发知识总结

[Java common collections](https://github.com/yunshuipiao/Potato/issues/55): Java 常用集合和并发结合总结

[Java LocK](https://github.com/yunshuipiao/Potato/issues/60)： java 各种锁总结

## Android

[Interaction between Native and js](https://github.com/yunshuipiao/Potato/issues/35)： Android native 和 JS 交互

[Android apk packaging process and signature algorithm](https://github.com/yunshuipiao/Potato/issues/33)： Android 打包流程和签名概述

[Android Multi Thread](https://github.com/yunshuipiao/Potato/issues/28)：多线程介绍

[TouchEvent](https://github.com/yunshuipiao/Potato/issues/26) ： 事件分发传递机制

[Handler：Android Message Model](https://github.com/yunshuipiao/Potato/issues/25) ： handler 通信机制

[View: draw process](https://github.com/yunshuipiao/Potato/issues/24)： View 和绘制流程

[Android Invalidate() And RequestLayout()](https://github.com/yunshuipiao/Potato/issues/52)：invalidate 触发屏幕绘制的分析

[Activity: Lifecycle and Launch Mode](https://github.com/yunshuipiao/Potato/issues/19)： 生命周期和启动模式实例

[SparseArray and ArrayMap](https://github.com/yunshuipiao/Potato/issues/10)： 省内存的数据结构，代替 HashMap

[Android Screen refresh mechanism](https://github.com/yunshuipiao/Potato/issues/39)：屏幕刷新机制

[Android ByteDance Screen Adaptation](https://github.com/yunshuipiao/Potato/issues/40)：头条屏幕适配方案

[Android Animation Summary](https://github.com/yunshuipiao/Potato/issues/42) ：动画相关知识总结

[Android Plug-in and Hotfix Summary](https://github.com/yunshuipiao/Potato/issues/46)：插件化和热修复原理

[Android SurfaceView And TextureView](https://github.com/yunshuipiao/Potato/issues/47) ：SurfaceView 和 TextureView 的对比

[Android Version Diff](https://github.com/yunshuipiao/Potato/issues/49) ： 6-10 Android 各版本的差异

[Android Root Check](https://github.com/yunshuipiao/Potato/issues/53)： 如何判断 Android 是否被 root

### 四大组件

[Android Service](https://github.com/yunshuipiao/Potato/issues/48)： service 的基本概念和使用

[Android Fragment](https://github.com/yunshuipiao/Potato/issues/51) ： fragment 基本介绍：懒加载

### Jetpack

关键字：AAC LifeCycle， ViewModel， Livedata

[AAC: LiveData](https://github.com/yunshuipiao/Potato/issues/38)

[AAC: ViewModel](https://github.com/yunshuipiao/Potato/issues/37)

[AAC: LifeCycle](https://github.com/yunshuipiao/Potato/issues/36) 

### Optimization： 优化

[Android Performance Optimization Tool](https://github.com/yunshuipiao/Potato/issues/57)： 性能优化工具总结

[Android UI Optimization](https://github.com/yunshuipiao/Potato/issues/29)： UI 优化

[Android Memory Optimization](https://github.com/yunshuipiao/Potato/issues/14)： 内存优化

[Android WebView Optimization](https://github.com/yunshuipiao/Potato/issues/41)： webview 使用优化

[Android RecyclerView Optimization](https://github.com/yunshuipiao/Potato/issues/45)： RecyclerView 使用和优化

[Android Bitmap Efficient Load](https://github.com/yunshuipiao/Potato/issues/50) ： 如何有效加载Bitmap 大图

[Android Network Optimization](https://github.com/yunshuipiao/Potato/issues/58): 网络检测和弱网优化

[Android ANR Summary](https://github.com/yunshuipiao/Potato/issues/59)：Android ANR 总结




### ActivityThread

[Activity： Lifecycle and ActivityThread](https://github.com/yunshuipiao/Potato/issues/22)：Android 启动过程中的生命周期方法调用

[ActivityThread: app launche flow](https://github.com/yunshuipiao/Potato/issues/20)： App 启动流程分析

### IPC 

[Binder](https://github.com/yunshuipiao/Potato/issues/21)：Binder 跨进程通信机制

### Third Module

[Glide：The loading process of the main flow](https://github.com/yunshuipiao/Potato/issues/18)： Glide 图片加载框主流程分析

[OKhttp(1): Basic usage and wiki](https://github.com/yunshuipiao/Potato/issues/4)： okhttp 官方指导和使用概述

[OKhttp(2): Main Flow Analysis](https://github.com/yunshuipiao/Potato/issues/15)： okhttp 主流程源码分析

[retrofit2](https://github.com/yunshuipiao/Potato/issues/7)： Restful API 请求框架 retrofit2 源码分析

[Arouter： Main Process](https://github.com/yunshuipiao/Potato/issues/11)： 组件化工具 Arouter 主流程分析

[Logger:Powerful logging library in Android](https://github.com/yunshuipiao/Potato/issues/3)： 强大的日志库介绍

[When Android meets KTX and anko](https://github.com/yunshuipiao/Potato/issues/2)： Android kotlin 好用的扩展

[LeakCanary Principle](https://github.com/yunshuipiao/Potato/issues/54)： LeakCanary 的基本原理分析：弱引用


## HTTPS

[when you type url into your browser and hit enter?](https://github.com/yunshuipiao/Potato/issues/34)： 浏览器输入地址回车之后发生了什么

[HTTPS](https://github.com/yunshuipiao/Potato/issues/23)： 概念介绍



### LeetCode 题解

[rice-noodles](https://github.com/yunshuipiao/rice-noodles)








