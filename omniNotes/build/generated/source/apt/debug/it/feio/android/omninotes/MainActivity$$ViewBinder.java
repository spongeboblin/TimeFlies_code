// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends it.feio.android.omninotes.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820691, "field 'croutonViewContainer'");
    target.croutonViewContainer = finder.castView(view, 2131820691, "field 'croutonViewContainer'");
    view = finder.findRequiredView(source, 2131820681, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131820681, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131820689, "field 'drawerLayout'");
    target.drawerLayout = finder.castView(view, 2131820689, "field 'drawerLayout'");
  }

  @Override public void unbind(T target) {
    target.croutonViewContainer = null;
    target.toolbar = null;
    target.drawerLayout = null;
  }
}
