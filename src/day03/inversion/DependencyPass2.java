package day03.inversion;

import org.junit.Test;

public class DependencyPass2 {
    //// 方式3 , 通过setter方法传递
    interface IOpenAndClose {
        public void open(); // 抽象方法

        public void setTv(ITV tv);
    }

    interface ITV { // ITV接口
        public void play();
    }
    class ChangHong implements ITV {
        @Override
        public void play() {
            // TODO Auto-generated method stub
            System.out.println("长虹电视机，打开");
        }
    }

    class OpenAndClose implements IOpenAndClose {
        private ITV tv;

        public void setTv(ITV tv) {
            this.tv = tv;
        }

        public void open() {
            this.tv.play();
        }
    }

    @Test
    public  void main() {
       ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new  OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}
