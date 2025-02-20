// instead of using the new keyword to create objects, you can use a factory method to do them for you

// may sound trivial but here's a practical example
// imagine you're developing a cross platform app that runs on both ios and android
// they both have th esame interface but in our code we're doing a bunch of conditional checks to determine which platform we're on

// eg code:

// public class IOSButton {...}
// public class AndroidButton {...}

// without factory
// const button1 = os == 'ios' ? new IOSButton() : new AndroidButton();
// const button2 = os == 'ios' ? new IOSButton() : new AndroidButton();

// with factory

public class Factory {
    createButton(os) {
        if (os == 'ios') {
            return new IOSButton();
        } else {
            return new AndroidButton();
        }
    }
}

OSFactory
AndroidFactory{
    createButton(){
        return new AndroidButton();
    }
}
IOSFactory