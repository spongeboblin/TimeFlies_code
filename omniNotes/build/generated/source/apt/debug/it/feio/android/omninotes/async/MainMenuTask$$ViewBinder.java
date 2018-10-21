// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes.async;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainMenuTask$$ViewBinder<T extends it.feio.android.omninotes.async.MainMenuTask> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820800, "field 'mDrawerList'");
    target.mDrawerList = finder.castView(view, 2131820800, "field 'mDrawerList'");
    view = finder.findRequiredView(source, 2131820802, "field 'mDrawerCategoriesList'");
    target.mDrawerCategoriesList = finder.castView(view, 2131820802, "field 'mDrawerCategoriesList'");
  }

  @Override public void unbind(T target) {
    target.mDrawerList = null;
    target.mDrawerCategoriesList = null;
  }
}
