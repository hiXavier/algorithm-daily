package com.offer.object;

/**
 * @author wuyanfeng
 * @description 父子类的方法重写
 * 创建子对象，首先会先访问父类构造器
 * @date 2020/12/23 14:00
 */
public class ExtendQuestion {
    public static void main(String[] args) {
        LaoWang wang = new XiaoWang();
    }
}

class LaoWang {
    public LaoWang() {
        write();
        read();
    }

    public void write() {
        System.out.println("老王写了一本《基督山伯爵》");
    }

    private void read() {
        System.out.println("老王在读《哈姆雷特》");
    }
}

class XiaoWang extends LaoWang {
    @Override
    public void write() {
        System.out.println("小王写了一本《茶花女》");
    }

    private void read() {
        System.out.println("小王在读《威尼斯商人》");
    }

    public XiaoWang() {
        write();
        read();
    }

}


