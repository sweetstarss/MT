pipeline {
    agent any //使用的执行节点
    tools {
        //定义工具，引号里的名字不能改，这个是管理员配置的名字
        maven ‘Maven’}
    stages {
        stage(‘Test’) { //stage表示一个阶段
            steps { //steps包含执行步骤
                //使用SonarQube环境，引号里的名字也不能改
                withSonarQubeEnv(‘SonarQube’) {
                    //执行Maven命令，清理后进行代码测试
                    sh ‘mvn clean sonar:sonar’}}}}}


