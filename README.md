# P2 Android 项目 README

## 项目概述

这是一个 Android 应用项目，名为 **P2**，使用 Android Studio 开发。该项目是一个基础的 Android 应用模板，包含基本的应用结构和配置。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/p2/          # Java 源代码
│   │   │   └── MainActivity.java                # 主活动
│   │   ├── res/                                  # 资源文件
│   │   │   ├── drawable/                         # 图片资源
│   │   │   ├── layout/                           # 布局文件
│   │   │   ├── mipmap-anydpi-v26/               # 应用图标
│   │   │   ├── values/                           # 字符串、样式等资源
│   │   │   ├── values-night/                     # 夜间模式资源
│   │   │   └── xml/                              # XML 配置文件
│   │   └── AndroidManifest.xml                  # 应用清单文件
├── build.gradle.kts                             # 模块构建配置
├── src/androidTest/                             # 仪器化测试
└── src/test/                                    # 单元测试
```


## 技术栈

- **语言**: Java
- **框架**: Android SDK
- **依赖库**:
  - androidx.core:core
  - androidx.appcompat:appcompat
  - com.google.android.material:material
  - androidx.annotation:annotation-experimental
  - androidx.emoji2:emoji2
  - androidx.lifecycle:lifecycle-process
  - androidx.print:print

## 配置信息

- **最低 SDK 版本**: 24
- **目标 SDK 版本**: 34
- **应用包名**: com.example.android.p2
- **版本号**: 1
- **版本名称**: 1.0

## 应用功能

- **主活动**: [MainActivity](file:///D:/androidstudio-projectnew/test3/p2/app/src/main/java/com/example/android/p2/MainActivity.java) 是应用的入口点
- **启动器**: 包含标准的启动器活动过滤器，允许应用从主屏幕启动

## 依赖管理

项目使用 Gradle 进行依赖管理，自动合并来自各种库的 [AndroidManifest.xml](file:///D:/androidstudio-projectnew/test3/p2/app/src/main/AndroidManifest.xml) 配置，包括：
- 权限声明
- 库组件注册
- 应用配置

## 构建说明

项目使用 Gradle 构建系统，支持以下构建类型：
- **Debug**: 用于开发和测试
- **Release**: 用于发布

## 资源文件

- **主题**: 使用 [Theme.P2](file:///D:/androidstudio-projectnew/test3/p2/app/src/main/res/values/themes.xml) 作为应用主题
- **图标**: 包含不同密度的启动器图标
- **字符串**: 在 [strings.xml](file:///D:/androidstudio-projectnew/test3/p2/app/src/main/res/values/strings.xml) 中定义应用名称等文本


## 开发环境

- **Android Studio**: 推荐使用最新版本
- **Gradle**: 版本由项目配置决定
- **Java**: JDK 8 或更高版本
