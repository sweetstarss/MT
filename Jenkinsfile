pipeline {
    agent any //ʹ�õ�ִ�нڵ�
    tools {
        //���幤�ߣ�����������ֲ��ܸģ�����ǹ���Ա���õ�����
        maven ��Maven��}
    stages {
        stage(��Test��) { //stage��ʾһ���׶�
            steps { //steps����ִ�в���
                //ʹ��SonarQube�����������������Ҳ���ܸ�
                withSonarQubeEnv(��SonarQube��) {
                    //ִ��Maven����������д������
                    sh ��mvn clean sonar:sonar��}}}
        stage('Build') {
            steps {
                sh ��mvn package�� //ʹ��Maven���
                //�鵵��Ʒ��������Jenkins��Ŀ��ҳ��������������
                //��Ҫ�޸���Ʒ�����Ŀ¼
                archive ��MachineTranslation.jar��}}}}


