### Random类用来生成随机数。
- 三个步骤

    1.导包
    
    2.创建
    
    Random r = new Random；
    
    3.使用
    
    获取一个随机int数：r.nextInt；（范围是int所有范围，有正和负）
    
    获取一个随机int数：r.nextInt();（参数假如是10，那么代表区间为（0~9），如果整体+1，代表[1~10]）