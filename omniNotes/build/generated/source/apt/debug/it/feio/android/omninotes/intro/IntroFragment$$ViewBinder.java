// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes.intro;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class IntroFragment$$ViewBinder<T extends it.feio.android.omninotes.intro.IntroFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820819, "field 'background'");
    target.background = view;
    view = finder.findRequiredView(source, 2131820820, "field 'title'");
    target.title = finder.castView(view, 2131820820, "field 'title'");
    view = finder.findRequiredView(source, 2131820821, "field 'image'");
    target.image = finder.castView(view, 2131820821, "field 'image'");
    view = finder.findRequiredView(source, 2131820822, "field 'image_small'");
    target.image_small = finder.castView(view, 2131820822, "field 'image_small'");
    view = finder.findRequiredView(source, 2131820823, "field 'description'");
    target.description = finder.castView(view, 2131820823, "field 'description'");
  }

  @Override public void unbind(T target) {
    target.background = null;
    target.title = null;
    target.image = null;
    target.image_small = null;
    target.description = null;
  }
}
