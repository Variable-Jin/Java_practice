package sec02.exam03;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();		// 구현 객체의 onClick() 메소드
		}
	
	static interface OnClickListener {
		void onClick();
	}

}
