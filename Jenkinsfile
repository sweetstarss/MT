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
                archive ��MachineTranslation.jar��}}
        stage('Deploy') {
            steps { //key�Ǹ��Ե���ĿID
                sh ��docker stop MachineTranslation || true�� //ֹ֮ͣǰ������
                sh ��docker rm MachineTranslation || true�� //ɾ��֮ǰ������
                //����������ð��ǰ��Ķ˿ں�ÿ����Ҫ��ͬ
                //dordoka/tomcat�Ǿ�����
                //sh ��docker run --name key -p 11111:8080 -d dordoka/tomcat��
                //����Ʒ���Ƶ�������
                //sh ��docker cp MachineTranslation.jar MachineTranslation:/opt/tomcat/webapps/��
		}}}}

