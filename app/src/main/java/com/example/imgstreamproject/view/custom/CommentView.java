package com.example.imgstreamproject.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.imgstreamproject.R;

public class CommentView extends ConstraintLayout {

    private String author;
    private String comment;
    private Integer points;

    private View rootView;
    private TextView tvAuthor;
    private TextView tvComment;
    private TextView tvPoints;

    public CommentView(Context context) {
        super(context);
        init(context);
    }

    public CommentView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        rootView = inflate(context, R.layout.view_comment, this);
        tvAuthor = rootView.findViewById(R.id.tv_view_commen_author);
        tvComment = rootView.findViewById(R.id.tv_view_comment_comment);
        tvPoints = rootView.findViewById(R.id.tv_view_comment_points);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        tvAuthor.setText(this.author);
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        tvComment.setText(this.comment);
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
        tvPoints.setText(String.valueOf(this.points).concat(" pts"));
    }
}
