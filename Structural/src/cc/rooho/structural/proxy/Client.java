package cc.rooho.structural.proxy;

/**
 * package : cc.rooho.structural.proxy
 * <p>
 * Description :
 *
 * @author Y.J.ZHOU
 * @date 2016.9.13 11:25.
 */
public class Client {

    class Proxy implements Subject {
        Subject _subject;
        public Proxy() {
            _subject = new RealSubject();
        }

        @Override
        public void doAction() {
            // do somethings
            _subject.doAction();
        }
    }

    class RealSubject implements Subject {
        @Override
        public void doAction() {
            System.out.println("Real subject action !");
        }
    }

    interface Subject {
        public void doAction();
    }
}
