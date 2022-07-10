package com.yalantis.ucrop.model;

import android.graphics.Matrix;
import android.graphics.RectF;

/**
 * Created by Oleksii Shliama [https://github.com/shliama] on 6/21/16.
 */
public class ImageState {

    private RectF mCropRect;
    private RectF mCurrentImageRect;

    private float mCurrentScale, mCurrentAngle;

    private Matrix mVerticalPerspectiveMatrix;
    private Matrix mHorizontalPerspectiveMatrix;
    private Matrix mHorizontalReflectMatrix;
    private Matrix mVerticalReflectMatrix;

    public ImageState(RectF cropRect, RectF currentImageRect, float currentScale, float currentAngle,
                      Matrix verticalReflectMatrix,
                      Matrix horizontalReflectMatrix,
                      Matrix verticalPerspectiveMatrix,
                      Matrix horizontalPerspectiveMatrix) {
        mCropRect = cropRect;
        mCurrentImageRect = currentImageRect;
        mCurrentScale = currentScale;
        mCurrentAngle = currentAngle;
        mVerticalReflectMatrix = verticalReflectMatrix;
        mHorizontalReflectMatrix = horizontalReflectMatrix;
        mVerticalPerspectiveMatrix = verticalPerspectiveMatrix;
        mHorizontalPerspectiveMatrix = horizontalPerspectiveMatrix;
    }

    public RectF getCropRect() {
        return mCropRect;
    }

    public RectF getCurrentImageRect() {
        return mCurrentImageRect;
    }

    public float getCurrentScale() {
        return mCurrentScale;
    }

    public float getCurrentAngle() {
        return mCurrentAngle;
    }

    public Matrix getVerticalPerspectiveMatrix() {
        return mVerticalPerspectiveMatrix;
    }

    public Matrix getHorizontalPerspectiveMatrix() {
        return mHorizontalPerspectiveMatrix;
    }

    public Matrix getHorizontalReflectMatrix() {
        return mHorizontalReflectMatrix;
    }

    public Matrix getVerticalReflectMatrix() {
        return mVerticalReflectMatrix;
    }
}
