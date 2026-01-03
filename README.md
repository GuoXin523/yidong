# Layout1 项目 README

## 项目概述

这是一个基于 Android Studio 开发的简单 Android 应用项目，项目名为 `layout1`，包名为 `com.example.android.layout_1`。该项目是一个基础的 Android 应用模板，主要用于学习和演示基本的 Android 应用结构和布局。

## 项目结构

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/android/layout_1/
│   │   │   └── MainActivity.java          # 主活动类
│   │   ├── res/                          # 资源文件目录
│   │   │   ├── drawable/                 # 图片资源
│   │   │   ├── layout/                   # 布局文件
│   │   │   ├── mipmap-anydpi-v26/        # 应用图标
│   │   │   ├── values/                   # 字符串、样式等资源
│   │   │   ├── values-night/             # 夜间模式资源
│   │   │   └── xml/                      # XML 配置文件
│   │   └── AndroidManifest.xml           # 应用配置文件
├── build.gradle.kts                      # 模块构建配置
└── src/androidTest/                      # 仪器化测试
└── src/test/                            # 单元测试
```


## 技术栈

- **编程语言**: Java
- **开发框架**: Android SDK + AndroidX
- **构建系统**: Gradle (Kotlin DSL)
- **最低支持版本**: API Level 24 (Android 7.0)
- **目标版本**: API Level 34 (Android 13)

## 依赖库

- **androidx.core:core:1.9.0** - AndroidX 核心库
- **androidx.appcompat:appcompat** - 兼容性支持库
- **androidx.constraintlayout:constraintlayout** - 约束布局库

## 功能特性

### 主要组件

1. **MainActivity**
   - 应用的主入口活动
   - 配置为启动活动（包含 MAIN action 和 LAUNCHER category）

### 权限配置

项目包含以下自动生成的权限：
- `com.example.android.layout_1.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION` - 用于动态接收器的安全权限

### 应用配置

- **应用图标**: 包含不同分辨率的启动图标（mipmap）
- **主题**: 使用 `Theme.Layout1` 主题
- **备份规则**: 配置了数据提取规则和备份规则
- **RTL 支持**: 支持从右到左的语言显示

## 构建说明

### 环境要求

- Android Studio (推荐最新版本)
- JDK 8 或更高版本
- Android SDK
- Gradle

### 构建步骤

1. **导入项目**
   - 在 Android Studio 中选择 "Open an existing Android Studio project"
   - 选择项目根目录

2. **同步项目**
   - 打开项目后，Android Studio 会自动同步 Gradle 文件
   - 或手动点击 "Sync Now" 按钮

3. **构建 APK**
   - 选择 Build > Build Bundle(s) / APK(s) > Build APK(s)
   - 或使用 Gradle 命令：`./gradlew assembleDebug`

4. **运行应用**
   - 连接 Android 设备或启动模拟器
   - 点击运行按钮或使用命令：`./gradlew installDebug`

## 配置文件说明

### AndroidManifest.xml

主要配置信息：
- 包名：`com.example.android.layout_1`
- 版本号：1.0 (versionCode 1)
- 最小 SDK 版本：24
- 目标 SDK 版本：34
- 主活动：[MainActivity](file://D:\androidstudio-projectnew\layout\layout1\app\src\main\java\com\example\android\layout_1\MainActivity.java#L10-L17)，配置为可导出并作为启动器

### 资源文件

- **strings.xml**: 应用名称等字符串资源
- **styles.xml**: 应用主题和样式定义
- **colors.xml**: 颜色值定义
- **data_extraction_rules.xml**: 数据提取规则配置
- **backup_rules.xml**: 自动备份配置

### 布局文件

- 位于 `res/layout/` 目录下
- 包含主界面布局定义



## 项目特点

- **现代化架构**: 使用 AndroidX 库
- **响应式设计**: 支持不同屏幕尺寸
- **国际化支持**: 准备了夜间模式资源
- **安全性**: 包含动态接收器的安全权限配置
- **备份支持**: 配置了数据备份和提取规则

## 开发建议

1. **代码规范**: 遵循 Android 开发最佳实践
2. **资源管理**: 合理组织资源文件，注意不同分辨率的适配
3. **权限管理**: 根据实际需求添加必要的权限
4. **测试覆盖**: 编写充分的单元测试和仪器化测试
5. **版本控制**: 使用 Git 进行版本管理

## 贡献指南

1. Fork 项目
2. 创建功能分支
3. 提交更改
4. 发起 Pull Request

## 许可证

此项目为学习模板，可自由使用和修改。
