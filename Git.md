# 第一章 Git简介

## 一. 作用

### 1.版本控制系统

### 2.优势

1. 速度快；
2. 设计简单；
3. 对非线性开发模式的强力支持（允许上千个并行开发的分支）；
4. 完全的分布式；
5. 有能力高效管理类似Linux内核一样的超大规模项目（速度与数据量）；

### 3. Git与svn对比

1. Svn是一个集中式版本控制系统；
   - 所有项目内容都放在同一服务器上；
   - 所有的版本都放在服务器中；
   - 使用中心化的思想进行版本控制；
   - 缺点
     - 服务器单点故障；
     - 容错性差；
2. Git是一个去中心化（分布式）的版本控制系统
   - 使用去中心化的思想进行版本控制；
   - Git没有中央服务器；
   - 每人的机器上都有完整的版本；

### 4.Git的工作流程

1. 从远程仓库中克隆Git资源作为本地仓库；
2. 从本地仓库中checkout代码然后进行代码修改；
3. 在提交前先将代码提交到暂存区；
4. 提交修改，提交到本地仓库，本地仓库保存修改的历史版本；
5. 在修改完成后，需要和团队成员共享代码时，可以将代码push到远程仓库；

### 5.  Git配置

1. 使用Gitconfig工具进行配置
2. 配置git用户名：git config --global user.name"用户名" ；
3. 配置git邮箱：git config --global user.email"用户名" ；
4. 查看配置信息：
   - git config --list: 查看所有信息；
   - git config --配置名称: 查看某一配置信息；

### 6. 使用git管理版本文件

1. 设置本地版本库：
   - 建立本地版本目录；
   - 右键使用Git Bush here命令；
   - cmd框中输入 git init初始化git版本库；
   - 初始化git版本库中有个.git隐藏文件；
   - 在仓库中的任意文件都可以使用加入提交的方式，放入本地仓库；
   - 也可以使用在文件夹中使用git在此建立版本库选项进行创建；
     - 注意：不要选择设为纯文本库；
2. 版本库：".git"目录就是版本库，将来所有文件都需要保存到版本库中；
3. 工作目录：包含".git"目录的目录，也就是".git"目录的上级目录（我们创建的就是工作目录）；
4. 解决版本库中图标不显示的问题
   - 运行中输入regidit.exe(打开注册表)；
   - 按照文件层次找到：HKEY_LOCAL_MACHING\Sfotware\Microsoft\widows\CurrentVersion\Explorer;
   - 修改键名Max Cached Icons（最大缓存图标）的值为2000；
   - 然后再使用tortoiseGit；
   - 选择图标覆盖；
   - 使用默认的方式；

### 7. 常见git命令

1. 提交文件
   - 使用TortoisGit提交
      - 右键点击TortoisGit；
      - 点击添加；
      - 然后提交；

   - 使用终端进行提交
      - 右键使用Git Bush here命令；
      - 输入git add 文件名.文件后缀添加到本地工作空间；
      - 输入git commit 文件名.文件后提交到本地版本库；
      - 输入git commit 文件名.文件后 -m 注释信息 提交到本地版本库；
      - 设置注释之后使用:wq完成提交

2. 工作区和暂存区
   - 工作区文件使用add命令提交到暂存区；
   - 使用commit命令再提交到本地版本库（即提交到master中）；
   - ref目录中的refs/heads/master看到主版本；

3. 查看文件状态
   - git status命令：
      - 查看当前仓库状态；
      - 查看哪些文件没有被提交（被跟踪）；

   - git status -s 命令查看文件状态
      - 前缀为？？表示为添加到本地工作空间；
      - A表示暂存在暂存区；
      - 没有显示的文件表示所有文件都被提交了；

4. 文件状态图标
   - 添加过图标为+；
   - 修改过的文件为！；
   - 提交到本地仓库中的文件为✔；

5. 查看修改历史
   - 使用TortoisGit查看
      - 右键点击TortoisGit；
      - 查看修改日志；

   - 使用终端查看
      - 使用git log 查看所有文件日志；
      - 使用git log  文件名.文件后 查看某一文件日志信息；
      - 后缀使用 -online 显示简化日志内容；
      - 后缀使用 -reverse 逆向显示日志内容；

6. 差异比较
   - 使用TortoisGit查看
      - 右键点击TortoisGit；
      - 查看比较差异；
   - 使用终端查看
      - 使用git diff 比较文件差异；

7. 还原修改
   - 只能在文件未提交时还原；
   - 右键点击TortoisGit；
   - 选择Revect；

8. 删除文件
   - 使用TortoisGit删除
      - 右键点击TortoisGit；
      - 选择删除；

   - 使用终端查看删除
      - get rm 文件名.文件后；

9. 重命名文件
   - 使用TortoisGit重命名
      - 右键点击TortoisGit；
      - 选择重命名；
   - 使用终端查看删除
      - get mv 文件名.文件后缀  新文件名.文件后缀；


### 8. 远程仓库github

1. 通过Git Bush here添加远程库
   - 可以使用HTPS与SSH两种方式进行仓库上传；
   - SSH协议时Secure Sheel（安全外壳协议）的简称；
     - 使用非对称加密进行加密；
     - 使用ssh协议时推荐使用基于密钥的验证方式；
     - 需创建一对密匙，公共密匙放在需要访问的服务器上；
     - 私人密匙则是用来进行验证；
   - SSH密钥生成
     - 右键打开Git bash；
     - 使用ssh -keygen -t rsa 生成ssh密匙；
     - 然后输入保存密匙的文件；
   - 配置ssh密匙
     - 选择settings选项卡；
     - 选择SSH and GPG keys;
     - 配置密匙；
   - 同步到远程仓库
     - 使用 git remote add 地址别名 ssh地址 链接上远程仓库
     - 使用gitpush -u 地址别名 master同步到远程仓库；
2. 通过TortoisGit推送到远程仓库
   - 首先对TortoisGit进行设置；
     - 远端
       - 配置URL：ssh地址；
       - 配置推送URL：与URL地址一致；
       - 配置putty密钥：使用公共密匙文件；
     - 网络
       - 配置SSH客户端(使用git所带的ssh)：git/user/bin/ssh.exe；
   - 使用同步，选择推送，发送到远程仓库；
3. 将远程仓库克隆到本地仓库
   - 通过Git Bush here克隆远程仓库
     - 建立新的空白文件夹；
     - git clone 仓库ssh地址；
   - 通过TortoisGit克隆远程仓库
     - 右键点击克隆；
4. 从远程仓库取代吗
   - git fetch命令：相当于从远程获取最新版本到本地，不会自动merge（合并代码）；
   - git pull命令：相当于从远程获取最新版本并且merge到本地；
5. 删除远程仓库
   - 设置 ，选择删除

### 9. 分支管理

1. TortoisGit创建分支
   - 右键点击TortoisGit；
   - 点击创建分支；
   - 设置分支版本名字；
2. Git Bush here创建分支
   - git branch 分支版本名称；
3. TortoisGit切换分支
   - 右键点击TortoisGit；
   - 点击切换检出；
4. TortoisGit合并分支
   - 切换到主版本；
   - 点击合并；
   - 选择需要合并的分支；
5. Git Bush here删除分支
   - git branch -d 分支版本名称；
6. 解决分支冲突问题
   - 点击存在！的文件
   - 解决冲突问题；
   - 点击解决冲突；
   - 重新提交；

## 10.Git标签

1. 可以通过标签来快速寻找版本；
2. Git Bush here打标签
   - git tag -a 标签名；
   - 添加备注；
3. Git Bush here查看标签
   - git tag；
4. Git Bush here删除标签
   - git tag -d 标签名；

### 11. idea中使用git

1. 设置git
   - setting的Version Control选项卡；
   - 添加git安装路径；
2. 将项目纳入本地仓库
   - VCS选项/import into Version Control/Created Git Repository;
   - 指向项目的上层目录；

### 12. 搭建自己的Git服务器

1. linux上搭建git服务器
   - 首先创建用户组：groupadd 用户组名；
   - 创建git用户名：useradd 用户组名 -g 用户名；
   - 更改用户密码：passwd 用户名；
2. 为用户创建证书
   - 收集所有需要登录的用户的公钥，公钥位于id_rsa.pub文件中；
   - 把我们的公钥导入到/home/用户名/.ssh/authorized keys文件里；
   - 将.ssh文件夹属性设置为777；
   - 将authorized_keys文件属性设置为644；
3. 初始化git仓库
   - 在home文件夹下创建gitrepo作为用户git仓库；
   - 将gitrepo权限设置为用户：chown 用户组名：用户名 gitrepo
   - 初始化git仓库：git init --bare runoob.git;
   - 将仓库(runoob.git)所有者更改为用户g'i't
