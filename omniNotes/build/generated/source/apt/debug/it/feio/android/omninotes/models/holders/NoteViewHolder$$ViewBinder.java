// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes.models.holders;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class NoteViewHolder$$ViewBinder<T extends it.feio.android.omninotes.models.holders.NoteViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820826, "field 'root'");
    target.root = view;
    view = finder.findRequiredView(source, 2131820853, "field 'cardLayout'");
    target.cardLayout = view;
    view = finder.findRequiredView(source, 2131820854, "field 'categoryMarker'");
    target.categoryMarker = view;
    view = finder.findRequiredView(source, 2131820855, "field 'title'");
    target.title = finder.castView(view, 2131820855, "field 'title'");
    view = finder.findRequiredView(source, 2131820861, "field 'content'");
    target.content = finder.castView(view, 2131820861, "field 'content'");
    view = finder.findRequiredView(source, 2131820862, "field 'date'");
    target.date = finder.castView(view, 2131820862, "field 'date'");
    view = finder.findRequiredView(source, 2131820858, "field 'archiveIcon'");
    target.archiveIcon = finder.castView(view, 2131820858, "field 'archiveIcon'");
    view = finder.findRequiredView(source, 2131820857, "field 'locationIcon'");
    target.locationIcon = finder.castView(view, 2131820857, "field 'locationIcon'");
    view = finder.findRequiredView(source, 2131820856, "field 'alarmIcon'");
    target.alarmIcon = finder.castView(view, 2131820856, "field 'alarmIcon'");
    view = finder.findRequiredView(source, 2131820860, "field 'lockedIcon'");
    target.lockedIcon = finder.castView(view, 2131820860, "field 'lockedIcon'");
    view = finder.findOptionalView(source, 2131820859, null);
    target.attachmentIcon = finder.castView(view, 2131820859, "field 'attachmentIcon'");
    view = finder.findOptionalView(source, 2131820863, null);
    target.attachmentThumbnail = finder.castView(view, 2131820863, "field 'attachmentThumbnail'");
  }

  @Override public void unbind(T target) {
    target.root = null;
    target.cardLayout = null;
    target.categoryMarker = null;
    target.title = null;
    target.content = null;
    target.date = null;
    target.archiveIcon = null;
    target.locationIcon = null;
    target.alarmIcon = null;
    target.lockedIcon = null;
    target.attachmentIcon = null;
    target.attachmentThumbnail = null;
  }
}
