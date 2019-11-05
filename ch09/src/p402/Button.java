package p402;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListenner listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}

}
