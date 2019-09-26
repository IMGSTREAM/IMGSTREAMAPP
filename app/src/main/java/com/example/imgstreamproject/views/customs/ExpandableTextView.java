package com.example.imgstreamproject.views.customs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;

public class ExpandableTextView extends ConstraintLayout implements View.OnClickListener {

    private String text;
    private Boolean expanded = false;
    private Integer minLines = 1;
    private Integer maxLines = 3;

    private Context context;

    private View rootView;
    private TextView tvText;
    private ImageView ivIcon;
    private View vLine;

    public ExpandableTextView(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public ExpandableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    public ExpandableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }


    private void init() {
        rootView = inflate(context, R.layout.custom_view_expandable_text_view, this);
        rootView.setOnClickListener(this);
        tvText = rootView.findViewById(R.id.custom_view_expandable_text_view_tv_text);

        ivIcon = rootView.findViewById(R.id.custom_view_expandable_text_view_iv_icon);
        vLine = rootView.findViewById(R.id.custom_view_expandable_text_view_line);
    }

    @Override
    public void onClick(View view) {
        expand();
    }

    public Boolean expand() {
        expanded = !expanded;
        if (expanded) {
            tvText.setMaxLines(999);
            tvText.setForeground(null);
            ivIcon.setRotation(180);
            vLine.setVisibility(VISIBLE);
        } else {
            tvText.setMaxLines(maxLines);
            Drawable d = getResources().getDrawable(R.drawable.bottom_fade_shadow, context.getTheme());
            tvText.setForeground(d);
            ivIcon.setRotation(0);
            vLine.setVisibility(INVISIBLE);
        }
        return expanded;
    }

    public Boolean isExpanded() {
        return expanded;
    }

    public int align(TextAlignment textAlignment) {
        if (textAlignment != null)
            tvText.setTextAlignment(textAlignment.value);
        return tvText.getTextAlignment();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        tvText.setText(this.text);
    }

    public Integer getMinLines() {
        return minLines;
    }

    public void setMinLines(Integer minLines) {
        this.minLines = minLines;
        tvText.setMinLines(this.minLines);
    }

    public Integer getMaxLines() {
        return maxLines;
    }

    public void setMaxLines(Integer maxLines) {
        this.maxLines = maxLines;
        tvText.setMaxLines(this.maxLines);
    }
    public enum TextAlignment {
        INHERIT(0),
        GRAVITY(1),
        TEXT_START(2),
        TEXT_END(3),
        CENTER(4),
        VIEW_START(5),
        VIEW_END(6);

        public final int value;

        TextAlignment(int value) {
            this.value = value;
        }
    }
}
