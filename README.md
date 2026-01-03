#  Layout 2 Android 项目 README

## 项目概述

这是一个 Android 应用项目，位于 `D:\androidstudio-projectnew\layout\layout2\app` 目录下。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/layout_2/
│   │   │   └── MainActivity.java
│   │   ├── res/
│   │   │   ├── drawable/
│   │   │   ├── layout/
│   │   │   ├── mipmap-anydpi-v26/
│   │   │   ├── values/
│   │   │   ├── values-night/
│   │   │   └── xml/
│   │   └── AndroidManifest.xml
│   ├── androidTest/
│   └── test/
├── build.gradle.kts
└── build/
```


## 项目详情

### 基本信息
- **包名**: `com.example.android.layout_2`
- **版本号**: 1
- **版本名称**: 1.0
- **最低 SDK 版本**: 24
- **目标 SDK 版本**: 34

### 应用配置
- **应用名称**: 从 `@string/app_name` 资源获取
- **图标**: `@mipmap/ic_launcher`
- **圆形图标**: `@mipmap/ic_launcher_round`
- **主题**: `@style/Theme.Layout2`
- **是否支持 RTL**: 是

### 功能特性
- 支持备份和恢复
- 包含数据提取规则 (`@xml/data_extraction_rules`)
- 包含完整备份内容规则 (`@xml/backup_rules`)

### 主要组件

#### MainActivity
- **类名**: [MainActivity](file://D:\androidstudio-projectnew\layout\layout2\app\src\main\java\com\example\android\layout_2\MainActivity.java#L7-L14)
- **导出状态**: `true`
- **启动方式**: 作为主活动启动（包含 MAIN action 和 LAUNCHER category）

## 依赖库

项目使用了 AndroidX 库：
- `androidx.core:core:1.9.0`
- `androidx.lifecycle:lifecycle-runtime:2.6.1`

## 构建配置

- 使用 Gradle 构建系统
- 使用 Kotlin DSL ([build.gradle.kts](file://D:\androidstudio-projectnew\layout\layout2\build.gradle.kts))

## 权限

项目包含以下自动生成的权限：
- `com.example.android.layout_2.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION`

## 资源文件

项目包含以下资源类型：
- 字符串资源 (`strings.xml`)
- 主题资源 (`themes.xml`)
- 图片资源（启动器图标）
- XML 配置文件（数据提取规则和备份规则）

## 构建产物

- APK 生成在 `build/intermediates/apk/debug/` 目录下
- 构建日志在 `build/outputs/logs/` 目录下
