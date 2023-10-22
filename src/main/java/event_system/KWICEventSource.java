package event_system;

import java.util.ArrayList;
import java.util.List;

class KWICEventSource {
    private List<KWICEventListener> listeners = new ArrayList<>();

    public void addListener(KWICEventListener listener) {
        listeners.add(listener);
    }

    public void triggerEvent(String eventData) {
        System.out.println("事件系统风格 - 触发事件：" + eventData);
        // 通知监听器
        for (KWICEventListener listener : listeners) {
            listener.handleKWICEvent(eventData);
        }
    }
}