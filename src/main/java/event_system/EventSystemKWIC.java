package event_system;

class EventSystemKWIC {
    public static void main(String[] args) {
        // 创建 KWIC 对象作为事件源
        KWICEventSource kwicEventSource = new KWICEventSource();
        // 注册事件监听器
        KWICEventListener listener = new KWICEventListener();
        kwicEventSource.addListener(listener);
        // 触发事件
        kwicEventSource.triggerEvent("Flowers are blooming");
    }
}