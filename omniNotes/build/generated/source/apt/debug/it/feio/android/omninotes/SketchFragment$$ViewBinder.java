// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SketchFragment$$ViewBinder<T extends it.feio.android.omninotes.SketchFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820805, "field 'stroke'");
    target.stroke = finder.castView(view, 2131820805, "field 'stroke'");
    view = finder.findRequiredView(source, 2131820806, "field 'eraser'");
    target.eraser = finder.castView(view, 2131820806, "field 'eraser'");
    view = finder.findRequiredView(source, 2131820810, "field 'mSketchView'");
    target.mSketchView = finder.castView(view, 2131820810, "field 'mSketchView'");
    view = finder.findRequiredView(source, 2131820807, "field 'undo'");
    target.undo = finder.castView(view, 2131820807, "field 'undo'");
    view = finder.findRequiredView(source, 2131820808, "field 'redo'");
    target.redo = finder.castView(view, 2131820808, "field 'redo'");
    view = finder.findRequiredView(source, 2131820809, "field 'erase'");
    target.erase = finder.castView(view, 2131820809, "field 'erase'");
  }

  @Override public void unbind(T target) {
    target.stroke = null;
    target.eraser = null;
    target.mSketchView = null;
    target.undo = null;
    target.redo = null;
    target.erase = null;
  }
}
