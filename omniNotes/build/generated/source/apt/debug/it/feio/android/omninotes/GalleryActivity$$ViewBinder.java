// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GalleryActivity$$ViewBinder<T extends it.feio.android.omninotes.GalleryActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820687, "field 'galleryRootView'");
    target.galleryRootView = finder.castView(view, 2131820687, "field 'galleryRootView'");
    view = finder.findRequiredView(source, 2131820688, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131820688, "field 'mViewPager'");
  }

  @Override public void unbind(T target) {
    target.galleryRootView = null;
    target.mViewPager = null;
  }
}
