// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SettingsActivity$$ViewBinder<T extends it.feio.android.omninotes.SettingsActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820681, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131820681, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131820691, "field 'croutonViewContainer'");
    target.croutonViewContainer = finder.castView(view, 2131820691, "field 'croutonViewContainer'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.croutonViewContainer = null;
  }
}
